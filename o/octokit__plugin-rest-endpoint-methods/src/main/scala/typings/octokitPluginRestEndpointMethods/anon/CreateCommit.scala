package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommit extends StObject {
  
  var createBlob: `1114`
  
  var createCommit: `1115`
  
  var createRef: `1116`
  
  var createTag: `1117`
  
  var createTree: `1118`
  
  var deleteRef: `1119`
  
  var getBlob: `1120`
  
  var getCommit: `1121`
  
  var getRef: `1122`
  
  var getTag: `1123`
  
  var getTree: `1124`
  
  var listMatchingRefs: `1125`
  
  var updateRef: `1126`
}
object CreateCommit {
  
  inline def apply(
    createBlob: `1114`,
    createCommit: `1115`,
    createRef: `1116`,
    createTag: `1117`,
    createTree: `1118`,
    deleteRef: `1119`,
    getBlob: `1120`,
    getCommit: `1121`,
    getRef: `1122`,
    getTag: `1123`,
    getTree: `1124`,
    listMatchingRefs: `1125`,
    updateRef: `1126`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCommit] (val x: Self) extends AnyVal {
    
    inline def setCreateBlob(value: `1114`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `1115`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `1116`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `1117`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `1118`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `1119`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `1120`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `1121`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `1122`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `1123`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `1124`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `1125`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `1126`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
