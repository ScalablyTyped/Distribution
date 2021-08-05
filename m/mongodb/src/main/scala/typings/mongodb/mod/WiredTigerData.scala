package typings.mongodb.mod

import typings.mongodb.anon.Allocationsrequiringfileextension
import typings.mongodb.anon.Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typings.mongodb.anon.Bloomfilterfalsepositives
import typings.mongodb.anon.Btreecheckpointgeneration
import typings.mongodb.anon.Bulkloadedcursorinsertcalls
import typings.mongodb.anon.Bytescurrentlyinthecache
import typings.mongodb.anon.Compressedpagesread
import typings.mongodb.anon.Dictionarymatches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiredTigerData extends StObject {
  
  var LSM: Bloomfilterfalsepositives
  
  var `block-manager`: Allocationsrequiringfileextension
  
  var btree: Btreecheckpointgeneration
  
  var cache: Bytescurrentlyinthecache
  
  var cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  
  var compression: Compressedpagesread
  
  var cursor: Bulkloadedcursorinsertcalls
  
  var reconciliation: Dictionarymatches
}
object WiredTigerData {
  
  inline def apply(
    LSM: Bloomfilterfalsepositives,
    `block-manager`: Allocationsrequiringfileextension,
    btree: Btreecheckpointgeneration,
    cache: Bytescurrentlyinthecache,
    cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: Compressedpagesread,
    cursor: Bulkloadedcursorinsertcalls,
    reconciliation: Dictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM.asInstanceOf[js.Any], btree = btree.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cache_walk = cache_walk.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], reconciliation = reconciliation.asInstanceOf[js.Any])
    __obj.updateDynamic("block-manager")(`block-manager`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredTigerData]
  }
  
  extension [Self <: WiredTigerData](x: Self) {
    
    inline def `setBlock-manager`(value: Allocationsrequiringfileextension): Self = StObject.set(x, "block-manager", value.asInstanceOf[js.Any])
    
    inline def setBtree(value: Btreecheckpointgeneration): Self = StObject.set(x, "btree", value.asInstanceOf[js.Any])
    
    inline def setCache(value: Bytescurrentlyinthecache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCache_walk(value: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered): Self = StObject.set(x, "cache_walk", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: Compressedpagesread): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: Bulkloadedcursorinsertcalls): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setLSM(value: Bloomfilterfalsepositives): Self = StObject.set(x, "LSM", value.asInstanceOf[js.Any])
    
    inline def setReconciliation(value: Dictionarymatches): Self = StObject.set(x, "reconciliation", value.asInstanceOf[js.Any])
  }
}
