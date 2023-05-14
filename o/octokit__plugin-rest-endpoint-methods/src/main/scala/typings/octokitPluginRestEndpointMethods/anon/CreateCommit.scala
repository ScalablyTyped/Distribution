package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommit extends StObject {
  
  var createBlob: `1160`
  
  var createCommit: `1161`
  
  var createRef: `1162`
  
  var createTag: `1163`
  
  var createTree: `1164`
  
  var deleteRef: `1165`
  
  var getBlob: `1166`
  
  var getCommit: `1167`
  
  var getRef: `1168`
  
  var getTag: `1169`
  
  var getTree: `1170`
  
  var listMatchingRefs: `1171`
  
  var updateRef: `1172`
}
object CreateCommit {
  
  inline def apply(
    createBlob: `1160`,
    createCommit: `1161`,
    createRef: `1162`,
    createTag: `1163`,
    createTree: `1164`,
    deleteRef: `1165`,
    getBlob: `1166`,
    getCommit: `1167`,
    getRef: `1168`,
    getTag: `1169`,
    getTree: `1170`,
    listMatchingRefs: `1171`,
    updateRef: `1172`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCommit] (val x: Self) extends AnyVal {
    
    inline def setCreateBlob(value: `1160`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `1161`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `1162`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `1163`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `1164`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `1165`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `1166`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `1167`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `1168`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `1169`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `1170`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `1171`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `1172`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
