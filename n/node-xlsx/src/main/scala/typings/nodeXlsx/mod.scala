package typings.nodeXlsx

import typings.node.bufferMod.global.Buffer
import typings.nodeXlsx.anon.Data
import typings.nodeXlsx.anon.Name
import typings.xlsx.mod.AOA2SheetOpts
import typings.xlsx.mod.AutoFilterInfo
import typings.xlsx.mod.ColInfo
import typings.xlsx.mod.ParsingOptions
import typings.xlsx.mod.ProtectInfo
import typings.xlsx.mod.Range
import typings.xlsx.mod.RowInfo
import typings.xlsx.mod.Sheet2JSONOpts
import typings.xlsx.mod.WritingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-xlsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("node-xlsx", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(worksheets: js.Array[WorkSheet[Any]]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def build(worksheets: js.Array[WorkSheet[Any]], param1: BuildOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def parse(mixed: Any): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
    inline def parse(mixed: Any, options: Sheet2JSONOpts & ParsingOptions): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
    
    inline def parseMetadata(mixed: Any): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMetadata")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
    inline def parseMetadata(mixed: Any, options: ParsingOptions): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMetadata")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
  }
  
  inline def build(worksheets: js.Array[WorkSheet[Any]]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def build(worksheets: js.Array[WorkSheet[Any]], param1: BuildOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def parse(mixed: Any): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
  inline def parse(mixed: Any, options: Sheet2JSONOpts & ParsingOptions): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
  
  inline def parseMetadata(mixed: Any): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMetadata")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
  inline def parseMetadata(mixed: Any, options: ParsingOptions): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMetadata")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
  
  trait BuildOptions
    extends StObject
       with WorkSheetOptions {
    
    var parseOptions: js.UndefOr[AOA2SheetOpts] = js.undefined
    
    var sheetOptions: js.UndefOr[WorkSheetOptions] = js.undefined
    
    var writeOptions: js.UndefOr[WritingOptions] = js.undefined
  }
  object BuildOptions {
    
    inline def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      inline def setParseOptions(value: AOA2SheetOpts): Self = StObject.set(x, "parseOptions", value.asInstanceOf[js.Any])
      
      inline def setParseOptionsUndefined: Self = StObject.set(x, "parseOptions", js.undefined)
      
      inline def setSheetOptions(value: WorkSheetOptions): Self = StObject.set(x, "sheetOptions", value.asInstanceOf[js.Any])
      
      inline def setSheetOptionsUndefined: Self = StObject.set(x, "sheetOptions", js.undefined)
      
      inline def setWriteOptions(value: WritingOptions): Self = StObject.set(x, "writeOptions", value.asInstanceOf[js.Any])
      
      inline def setWriteOptionsUndefined: Self = StObject.set(x, "writeOptions", js.undefined)
    }
  }
  
  trait WorkSheet[T] extends StObject {
    
    var data: js.Array[js.Array[T]]
    
    var name: String
    
    var options: WorkSheetOptions
  }
  object WorkSheet {
    
    inline def apply[T](data: js.Array[js.Array[T]], name: String, options: WorkSheetOptions): WorkSheet[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkSheet[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkSheet[?], T] (val x: Self & WorkSheet[T]) extends AnyVal {
      
      inline def setData(value: js.Array[js.Array[T]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[T]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: WorkSheetOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkSheetOptions extends StObject {
    
    /** AutoFilter info */
    @JSName("!autofilter")
    var Exclamationmarkautofilter: js.UndefOr[AutoFilterInfo] = js.undefined
    
    /** Column Info */
    @JSName("!cols")
    var Exclamationmarkcols: js.UndefOr[js.Array[ColInfo]] = js.undefined
    
    /** Merge Ranges */
    @JSName("!merges")
    var Exclamationmarkmerges: js.UndefOr[js.Array[Range]] = js.undefined
    
    /** Worksheet Protection info */
    @JSName("!protect")
    var Exclamationmarkprotect: js.UndefOr[ProtectInfo] = js.undefined
    
    /** Row Info */
    @JSName("!rows")
    var Exclamationmarkrows: js.UndefOr[js.Array[RowInfo]] = js.undefined
  }
  object WorkSheetOptions {
    
    inline def apply(): WorkSheetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkSheetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkSheetOptions] (val x: Self) extends AnyVal {
      
      inline def setExclamationmarkautofilter(value: AutoFilterInfo): Self = StObject.set(x, "!autofilter", value.asInstanceOf[js.Any])
      
      inline def setExclamationmarkautofilterUndefined: Self = StObject.set(x, "!autofilter", js.undefined)
      
      inline def setExclamationmarkcols(value: js.Array[ColInfo]): Self = StObject.set(x, "!cols", value.asInstanceOf[js.Any])
      
      inline def setExclamationmarkcolsUndefined: Self = StObject.set(x, "!cols", js.undefined)
      
      inline def setExclamationmarkcolsVarargs(value: ColInfo*): Self = StObject.set(x, "!cols", js.Array(value*))
      
      inline def setExclamationmarkmerges(value: js.Array[Range]): Self = StObject.set(x, "!merges", value.asInstanceOf[js.Any])
      
      inline def setExclamationmarkmergesUndefined: Self = StObject.set(x, "!merges", js.undefined)
      
      inline def setExclamationmarkmergesVarargs(value: Range*): Self = StObject.set(x, "!merges", js.Array(value*))
      
      inline def setExclamationmarkprotect(value: ProtectInfo): Self = StObject.set(x, "!protect", value.asInstanceOf[js.Any])
      
      inline def setExclamationmarkprotectUndefined: Self = StObject.set(x, "!protect", js.undefined)
      
      inline def setExclamationmarkrows(value: js.Array[RowInfo]): Self = StObject.set(x, "!rows", value.asInstanceOf[js.Any])
      
      inline def setExclamationmarkrowsUndefined: Self = StObject.set(x, "!rows", js.undefined)
      
      inline def setExclamationmarkrowsVarargs(value: RowInfo*): Self = StObject.set(x, "!rows", js.Array(value*))
    }
  }
}
