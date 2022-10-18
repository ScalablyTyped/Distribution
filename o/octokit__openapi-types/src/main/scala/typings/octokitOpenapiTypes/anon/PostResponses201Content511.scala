package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content511 extends StObject {
  
  /**
    * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.
    *
    * If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://docs.github.com/rest/reference/git#create-a-commit)" and "[Update a reference](https://docs.github.com/rest/reference/git#update-a-reference)."
    *
    * Returns an error if you try to delete a file that does not exist.
    */
  var post: Responses201Content511
}
object PostResponses201Content511 {
  
  inline def apply(post: Responses201Content511): PostResponses201Content511 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content511]
  }
  
  extension [Self <: PostResponses201Content511](x: Self) {
    
    inline def setPost(value: Responses201Content511): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
