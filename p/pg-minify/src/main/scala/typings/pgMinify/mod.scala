package typings.pgMinify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(sql: String): String = ^.asInstanceOf[js.Dynamic].apply(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(sql: String, options: IMinifyOptions): String = (^.asInstanceOf[js.Dynamic].apply(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pg-minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pg-minify", "SQLParsingError")
  @js.native
  class SQLParsingError ()
    extends StObject
       with Error {
    
    var code: parsingErrorCode = js.native
    
    var error: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var position: IErrorPosition = js.native
    
    @JSName("stack")
    var stack_SQLParsingError: String = js.native
  }
  
  @js.native
  sealed trait parsingErrorCode extends StObject
  @JSImport("pg-minify", "parsingErrorCode")
  @js.native
  object parsingErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[parsingErrorCode & Double] = js.native
    
    // Unclosed quoted identifier.
    @js.native
    sealed trait multiLineQI
      extends StObject
         with parsingErrorCode
    /* 3 */ val multiLineQI: typings.pgMinify.mod.parsingErrorCode.multiLineQI & Double = js.native
    
    @js.native
    sealed trait unclosedMLC
      extends StObject
         with parsingErrorCode
    /* 0 */ val unclosedMLC: typings.pgMinify.mod.parsingErrorCode.unclosedMLC & Double = js.native
    
    // Unclosed text block.
    @js.native
    sealed trait unclosedQI
      extends StObject
         with parsingErrorCode
    /* 2 */ val unclosedQI: typings.pgMinify.mod.parsingErrorCode.unclosedQI & Double = js.native
    
    // Unclosed multi-line comment.
    @js.native
    sealed trait unclosedText
      extends StObject
         with parsingErrorCode
    /* 1 */ val unclosedText: typings.pgMinify.mod.parsingErrorCode.unclosedText & Double = js.native
  }
  
  trait IErrorPosition extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object IErrorPosition {
    
    @scala.inline
    def apply(column: Double, line: Double): IErrorPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrorPosition]
    }
    
    @scala.inline
    implicit class IErrorPositionMutableBuilder[Self <: IErrorPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMinifyOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var removeAll: js.UndefOr[Boolean] = js.undefined
  }
  object IMinifyOptions {
    
    @scala.inline
    def apply(): IMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMinifyOptions]
    }
    
    @scala.inline
    implicit class IMinifyOptionsMutableBuilder[Self <: IMinifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setRemoveAll(value: Boolean): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    }
  }
}
