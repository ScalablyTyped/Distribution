package typings.mongodb.mod

import typings.mongodb.mongodbInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteConcernSettings extends StObject {
  
  /** The file sync write concern */
  var fsync: js.UndefOr[Boolean | `1`] = js.undefined
  
  /** The journal write concern */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /** The journal write concern */
  var journal: js.UndefOr[Boolean] = js.undefined
  
  /** The write concern */
  var w: js.UndefOr[W] = js.undefined
  
  /** The write concern timeout */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
  
  /** The write concern timeout */
  var wtimeoutMS: js.UndefOr[scala.Double] = js.undefined
}
object WriteConcernSettings {
  
  inline def apply(): WriteConcernSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConcernSettings]
  }
  
  extension [Self <: WriteConcernSettings](x: Self) {
    
    inline def setFsync(value: Boolean | `1`): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setJournal(value: Boolean): Self = StObject.set(x, "journal", value.asInstanceOf[js.Any])
    
    inline def setJournalUndefined: Self = StObject.set(x, "journal", js.undefined)
    
    inline def setW(value: W): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutMS(value: scala.Double): Self = StObject.set(x, "wtimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutMSUndefined: Self = StObject.set(x, "wtimeoutMS", js.undefined)
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
