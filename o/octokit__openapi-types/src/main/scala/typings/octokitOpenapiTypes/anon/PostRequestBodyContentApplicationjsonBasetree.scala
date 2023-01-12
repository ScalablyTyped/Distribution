package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBasetree extends StObject {
  
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://docs.github.com/rest/reference/git#create-a-commit)" and "[Update a reference](https://docs.github.com/rest/reference/git#update-a-reference)."
    *
    * Returns an error if you try to delete a file that does not exist.
    */
  var post: RequestBodyContentApplicationjsonBasetree
}
object PostRequestBodyContentApplicationjsonBasetree {
  
  inline def apply(post: RequestBodyContentApplicationjsonBasetree): PostRequestBodyContentApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBasetree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonBasetree] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBasetree): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
