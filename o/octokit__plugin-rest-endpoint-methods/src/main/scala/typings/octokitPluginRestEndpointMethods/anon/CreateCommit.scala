package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommit extends StObject {
  
  var createBlob: `1164`
  
  var createCommit: `1165`
  
  var createRef: `1166`
  
  var createTag: `1167`
  
  var createTree: `1168`
  
  var deleteRef: `1169`
  
  var getBlob: `1170`
  
  var getCommit: `1171`
  
  var getRef: `1172`
  
  var getTag: `1173`
  
  var getTree: `1174`
  
  var listMatchingRefs: `1175`
  
  var updateRef: `1176`
}
object CreateCommit {
  
  inline def apply(
    createBlob: `1164`,
    createCommit: `1165`,
    createRef: `1166`,
    createTag: `1167`,
    createTree: `1168`,
    deleteRef: `1169`,
    getBlob: `1170`,
    getCommit: `1171`,
    getRef: `1172`,
    getTag: `1173`,
    getTree: `1174`,
    listMatchingRefs: `1175`,
    updateRef: `1176`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCommit] (val x: Self) extends AnyVal {
    
    inline def setCreateBlob(value: `1164`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `1165`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `1166`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `1167`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `1168`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `1169`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `1170`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `1171`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `1172`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `1173`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `1174`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `1175`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `1176`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
