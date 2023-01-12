package typings.mdastUtilGfmTable

import typings.mdastUtilFromMarkdown.mod.Extension
import typings.mdastUtilFromMarkdown.mod.Handle
import typings.mdastUtilToMarkdown.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-gfm-table/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdast-util-gfm-table/lib", "gfmTableFromMarkdown")
  @js.native
  val gfmTableFromMarkdown: FromMarkdownExtension = js.native
  
  inline def gfmTableToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmTableToMarkdown(options: Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type AlignType = typings.mdast.mod.AlignType
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type InlineCode = typings.mdast.mod.InlineCode
  
  type MarkdownTableOptions = typings.markdownTable.mod.MarkdownTableOptions
  
  trait Options extends StObject {
    
    var stringLength: js.UndefOr[js.Function1[/* value */ String, Double]] = js.undefined
    
    var tableCellPadding: js.UndefOr[Boolean] = js.undefined
    
    var tablePipeAlign: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setStringLength(value: /* value */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      inline def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
      
      inline def setTableCellPadding(value: Boolean): Self = StObject.set(x, "tableCellPadding", value.asInstanceOf[js.Any])
      
      inline def setTableCellPaddingUndefined: Self = StObject.set(x, "tableCellPadding", js.undefined)
      
      inline def setTablePipeAlign(value: Boolean): Self = StObject.set(x, "tablePipeAlign", value.asInstanceOf[js.Any])
      
      inline def setTablePipeAlignUndefined: Self = StObject.set(x, "tablePipeAlign", js.undefined)
    }
  }
  
  type SafeOptions = typings.mdastUtilToMarkdown.mod.SafeOptions
  
  type Table = typings.mdast.mod.Table
  
  type TableCell = typings.mdast.mod.TableCell
  
  type TableRow = typings.mdast.mod.TableRow
  
  type ToMarkdownContext = Context
  
  type ToMarkdownExtension = typings.mdastUtilToMarkdown.mod.Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.mod.Handle
}
