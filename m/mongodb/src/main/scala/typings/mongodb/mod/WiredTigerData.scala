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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiredTigerData extends StObject {
  
  var LSM: Bloomfilterfalsepositives = js.native
  
  var `block-manager`: Allocationsrequiringfileextension = js.native
  
  var btree: Btreecheckpointgeneration = js.native
  
  var cache: Bytescurrentlyinthecache = js.native
  
  var cache_walk: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered = js.native
  
  var compression: Compressedpagesread = js.native
  
  var cursor: Bulkloadedcursorinsertcalls = js.native
  
  var reconciliation: Dictionarymatches = js.native
}
object WiredTigerData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WiredTigerDataMutableBuilder[Self <: WiredTigerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBlock-manager`(value: Allocationsrequiringfileextension): Self = StObject.set(x, "block-manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtree(value: Btreecheckpointgeneration): Self = StObject.set(x, "btree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: Bytescurrentlyinthecache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache_walk(value: Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered): Self = StObject.set(x, "cache_walk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: Compressedpagesread): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Bulkloadedcursorinsertcalls): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLSM(value: Bloomfilterfalsepositives): Self = StObject.set(x, "LSM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconciliation(value: Dictionarymatches): Self = StObject.set(x, "reconciliation", value.asInstanceOf[js.Any])
  }
}
