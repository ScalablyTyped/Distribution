package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCommit extends StObject {
  
  var createBlob: `697`
  
  var createCommit: `698`
  
  var createRef: `699`
  
  var createTag: `700`
  
  var createTree: `701`
  
  var deleteRef: `702`
  
  var getBlob: `703`
  
  var getCommit: `704`
  
  var getRef: `705`
  
  var getTag: `706`
  
  var getTree: `707`
  
  var listMatchingRefs: `708`
  
  var updateRef: `709`
}
object CreateCommit {
  
  inline def apply(
    createBlob: `697`,
    createCommit: `698`,
    createRef: `699`,
    createTag: `700`,
    createTree: `701`,
    deleteRef: `702`,
    getBlob: `703`,
    getCommit: `704`,
    getRef: `705`,
    getTag: `706`,
    getTree: `707`,
    listMatchingRefs: `708`,
    updateRef: `709`
  ): CreateCommit = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommit]
  }
  
  extension [Self <: CreateCommit](x: Self) {
    
    inline def setCreateBlob(value: `697`): Self = StObject.set(x, "createBlob", value.asInstanceOf[js.Any])
    
    inline def setCreateCommit(value: `698`): Self = StObject.set(x, "createCommit", value.asInstanceOf[js.Any])
    
    inline def setCreateRef(value: `699`): Self = StObject.set(x, "createRef", value.asInstanceOf[js.Any])
    
    inline def setCreateTag(value: `700`): Self = StObject.set(x, "createTag", value.asInstanceOf[js.Any])
    
    inline def setCreateTree(value: `701`): Self = StObject.set(x, "createTree", value.asInstanceOf[js.Any])
    
    inline def setDeleteRef(value: `702`): Self = StObject.set(x, "deleteRef", value.asInstanceOf[js.Any])
    
    inline def setGetBlob(value: `703`): Self = StObject.set(x, "getBlob", value.asInstanceOf[js.Any])
    
    inline def setGetCommit(value: `704`): Self = StObject.set(x, "getCommit", value.asInstanceOf[js.Any])
    
    inline def setGetRef(value: `705`): Self = StObject.set(x, "getRef", value.asInstanceOf[js.Any])
    
    inline def setGetTag(value: `706`): Self = StObject.set(x, "getTag", value.asInstanceOf[js.Any])
    
    inline def setGetTree(value: `707`): Self = StObject.set(x, "getTree", value.asInstanceOf[js.Any])
    
    inline def setListMatchingRefs(value: `708`): Self = StObject.set(x, "listMatchingRefs", value.asInstanceOf[js.Any])
    
    inline def setUpdateRef(value: `709`): Self = StObject.set(x, "updateRef", value.asInstanceOf[js.Any])
  }
}
