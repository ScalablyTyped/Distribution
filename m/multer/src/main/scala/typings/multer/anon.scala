package typings.multer

import typings.node.Buffer
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
    
    @scala.inline
    def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    @scala.inline
    implicit class FieldNameSizeMutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      @scala.inline
      def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
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
    
    @scala.inline
    def apply(): PartialFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFile]
    }
    
    @scala.inline
    implicit class PartialFileMutableBuilder[Self <: PartialFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldnameUndefined: Self = StObject.set(x, "fieldname", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      @scala.inline
      def setOriginalname(value: String): Self = StObject.set(x, "originalname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalnameUndefined: Self = StObject.set(x, "originalname", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
