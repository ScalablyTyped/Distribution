package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOrigin extends StObject {
  
  /**
    * Contains the source column of the error. PostCSS will use input
    * source map to detect the original error location. If you wrote a
    * Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you
    * need the position in the PostCSS input (e.g., to debug the
    * previous compiler), use error.input.column.
    */
  var column: js.UndefOr[Double] = js.native
  
  /**
    * If parser's from option is set, contains the absolute path to the
    * broken file. PostCSS will use the input source map to detect the
    * original error location. If you wrote a Sass file, then compiled it
    * to CSS and parsed it with PostCSS, PostCSS will show the original
    * position in the Sass file. If you need the position in the PostCSS
    * input (e.g., to debug the previous compiler), use error.input.file.
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * Contains the source line of the error. PostCSS will use the input
    * source map to detect the original error location. If you wrote a Sass
    * file, then compiled it to CSS and parsed it with PostCSS, PostCSS
    * will show the original position in the Sass file. If you need the
    * position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.line.
    */
  var line: js.UndefOr[Double] = js.native
  
  /**
    * Contains the source code of the broken file. PostCSS will use the
    * input source map to detect the original error location. If you wrote
    * a Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you need
    * the position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.source.
    */
  var source: js.UndefOr[String] = js.native
}
object InputOrigin {
  
  @scala.inline
  def apply(): InputOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOrigin]
  }
  
  @scala.inline
  implicit class InputOriginMutableBuilder[Self <: InputOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
