package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommit extends StObject {
  
  var createBlob: `1046`
  
  var createCommit: `1047`
  
  var createRef: `1048`
  
  var createTag: `1049`
  
  var createTree: `1050`
  
  var deleteRef: `1051`
  
  var getBlob: `1052`
  
  var getCommit: `1053`
  
  var getRef: `1054`
  
  var getTag: `1055`
  
  var getTree: `1056`
  
  var listMatchingRefs: `1057`
  
  var updateRef: `1058`
}
object CreateCommit {
  
  inline def apply(
    createBlob: `1046`,
    createCommit: `1047`,
    createRef: `1048`,
    createTag: `1049`,
    createTree: `1050`,
    deleteRef: `1051`,
    getBlob: `1052`,
    getCommit: `1053`,
    getRef: `1054`,
    getTag: `1055`,
    getTree: `1056`,
    listMatchingRefs: `1057`,
    updateRef: `1058`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  extension [Self <: CreateCommit](x: Self) {
    
    inline def setCreateBlob(value: `1046`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `1047`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `1048`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `1049`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `1050`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `1051`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `1052`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `1053`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `1054`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `1055`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `1056`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `1057`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `1058`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
