package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SodaCollectionOptions extends StObject {
  
  /**
    * Metadata specifying various details about the collection, such as its database storage, whether it should
    * track version and time stamp document components, how such components are generated, and what document
    * types are.
    *
    * If undefined or null, then a default collection metadata description will be used. The default
    * metadata specifies that the collection contains only JSON documents, and is recommend for most SODA users.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaclientkeys
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-49EFF3D3-9FAB-4DA6-BDE2-2650383566A3
    */
  var metaData: js.UndefOr[SodaMetadata] = js.undefined
  
  /**
    * If mode is SODA_COLL_MAP_MODE, the collection will be stored in an externally,
    * previously created table. A future sodaCollection.drop() will not drop the collection table.
    * It will simply unmap it, making it inaccessible to SODA operations.
    *
    * Most users will leave mode undefined.
    */
  var mode: js.UndefOr[Double] = js.undefined
}
object SodaCollectionOptions {
  
  @scala.inline
  def apply(): SodaCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaCollectionOptions]
  }
  
  @scala.inline
  implicit class SodaCollectionOptionsMutableBuilder[Self <: SodaCollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetaData(value: SodaMetadata): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
