package typings.multer

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FieldNameSize extends StObject {
    
    /** Maximum size of each form field name in bytes. (Default: 100) */
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    /** Maximum size of each form field value in bytes. (Default: 1048576) */
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of non-file form fields. (Default: Infinity) */
    var fields: js.UndefOr[Double] = js.undefined
    
    /** Maximum size of each file in bytes. (Default: Infinity) */
    var fileSize: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of file fields. (Default: Infinity) */
    var files: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of headers. (Default: 2000) */
    var headerPairs: js.UndefOr[Double] = js.undefined
    
    /** Maximum number of parts (non-file fields + files). (Default: Infinity) */
    var parts: js.UndefOr[Double] = js.undefined
  }
  object FieldNameSize {
    
    inline def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    extension [Self <: FieldNameSize](x: Self) {
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
  
  /* Inlined std.Partial<multer.multer.<global>.Express.Multer.File> */
  trait PartialFile extends StObject {
    
    var buffer: js.UndefOr[Buffer] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fieldname: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var mimetype: js.UndefOr[String] = js.undefined
    
    var originalname: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Readable] = js.undefined
  }
  object PartialFile {
    
    inline def apply(): PartialFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFile]
    }
    
    extension [Self <: PartialFile](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
      
      inline def setFieldnameUndefined: Self = StObject.set(x, "fieldname", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      inline def setOriginalname(value: String): Self = StObject.set(x, "originalname", value.asInstanceOf[js.Any])
      
      inline def setOriginalnameUndefined: Self = StObject.set(x, "originalname", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
