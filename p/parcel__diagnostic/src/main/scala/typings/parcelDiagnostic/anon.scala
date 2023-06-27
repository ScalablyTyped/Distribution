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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: DiagnosticHighlightLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: DiagnosticHighlightLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndStart extends StObject {
    
    /** 1-based, exclusive */
    val end: Line
    
    /** 1-based, inclusive */
    val start: Line
  }
  object EndStart {
    
    inline def apply(end: Line, start: Line): EndStart = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndStart] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Line): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Line): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: key | value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Line extends StObject {
    
    val column: Double
    
    val line: Double
  }
  object Line {
    
    inline def apply(column: Double, line: Double): Line = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start extends StObject {
    
    var end: Line
    
    var start: Line
  }
  object Start {
    
    inline def apply(end: Line, start: Line): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Line): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Line): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
