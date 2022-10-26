package typings.pollyjsPersisterFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RecordingsDir extends StObject {
    
    var recordingsDir: js.UndefOr[String] = js.undefined
  }
  object RecordingsDir {
    
    inline def apply(): RecordingsDir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingsDir]
    }
    
    extension [Self <: RecordingsDir](x: Self) {
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
}
