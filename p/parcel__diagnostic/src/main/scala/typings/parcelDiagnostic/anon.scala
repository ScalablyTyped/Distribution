package typings.parcelDiagnostic

import typings.parcelDiagnostic.mod.DiagnosticHighlightLocation
import typings.parcelDiagnostic.parcelDiagnosticStrings.key
import typings.parcelDiagnostic.parcelDiagnosticStrings.value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: Any
    
    var pointers: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any
      ]
  }
  object Data {
    
    inline def apply(
      data: Any,
      pointers: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any
        ]
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPointers(
        value: Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any
            ]
      ): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: DiagnosticHighlightLocation
    
    var start: DiagnosticHighlightLocation
  }
  object End {
    
    inline def apply(end: DiagnosticHighlightLocation, start: DiagnosticHighlightLocation): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: DiagnosticHighlightLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: DiagnosticHighlightLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilePath extends StObject {
    
    var filePath: js.UndefOr[String | Null] = js.undefined
    
    var origin: js.UndefOr[String | Null] = js.undefined
  }
  object FilePath {
    
    inline def apply(): FilePath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePath]
    }
    
    extension [Self <: FilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginNull: Self = StObject.set(x, "origin", null)
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[key | Null | value] = js.undefined
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: key | value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
