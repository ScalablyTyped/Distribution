package typings.nodeSass

import typings.nodeSass.mod._ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents
    extends StObject
       with _ImporterReturnType {
    
    var contents: String
    
    var file: js.UndefOr[String] = js.undefined
  }
  object Contents {
    
    @scala.inline
    def apply(contents: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  trait Duration extends StObject {
    
    var duration: Double
    
    var end: Double
    
    var entry: String
    
    var includedFiles: js.Array[String]
    
    var start: Double
  }
  object Duration {
    
    @scala.inline
    def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait File
    extends StObject
       with _ImporterReturnType {
    
    var file: String
  }
  object File {
    
    @scala.inline
    def apply(file: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
