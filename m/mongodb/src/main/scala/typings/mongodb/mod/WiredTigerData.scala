package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Allocationsrequiringfileextension
import typings.mongodb.anon.Averagedifferencebetweenc
import typings.mongodb.anon.Bulkloadedcursorinsertcalls
import typings.mongodb.anon.bloomfilterfalsepositives
import typings.mongodb.anon.btreecheckpointgeneration
import typings.mongodb.anon.bytescurrentlyinthecachen
import typings.mongodb.anon.compressedpagesreadnumber
import typings.mongodb.anon.dictionarymatchesnumberfa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiredTigerData
  extends StObject
     with Document {
  
  var LSM: bloomfilterfalsepositives
  
  var `block-manager`: Allocationsrequiringfileextension
  
  var btree: btreecheckpointgeneration
  
  var cache: bytescurrentlyinthecachen
  
  var cache_walk: Averagedifferencebetweenc
  
  var compression: compressedpagesreadnumber
  
  var cursor: Bulkloadedcursorinsertcalls
  
  var reconciliation: dictionarymatchesnumberfa
}
object WiredTigerData {
  
  inline def apply(
    LSM: bloomfilterfalsepositives,
    `block-manager`: Allocationsrequiringfileextension,
    btree: btreecheckpointgeneration,
    cache: bytescurrentlyinthecachen,
    cache_walk: Averagedifferencebetweenc,
    compression: compressedpagesreadnumber,
    cursor: Bulkloadedcursorinsertcalls,
    reconciliation: dictionarymatchesnumberfa
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM.asInstanceOf[js.Any], btree = btree.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cache_walk = cache_walk.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], reconciliation = reconciliation.asInstanceOf[js.Any])
    __obj.updateDynamic("block-manager")(`block-manager`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredTigerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiredTigerData] (val x: Self) extends AnyVal {
    
    inline def `setBlock-manager`(value: Allocationsrequiringfileextension): Self = StObject.set(x, "block-manager", value.asInstanceOf[js.Any])
    
    inline def setBtree(value: btreecheckpointgeneration): Self = StObject.set(x, "btree", value.asInstanceOf[js.Any])
    
    inline def setCache(value: bytescurrentlyinthecachen): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCache_walk(value: Averagedifferencebetweenc): Self = StObject.set(x, "cache_walk", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: compressedpagesreadnumber): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: Bulkloadedcursorinsertcalls): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setLSM(value: bloomfilterfalsepositives): Self = StObject.set(x, "LSM", value.asInstanceOf[js.Any])
    
    inline def setReconciliation(value: dictionarymatchesnumberfa): Self = StObject.set(x, "reconciliation", value.asInstanceOf[js.Any])
  }
}
