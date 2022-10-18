package typings.nodeXlsx

import typings.nodeXlsx.anon.Data
import typings.nodeXlsx.anon.Name
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
    
    @JSImport("node-xlsx", "default.build")
    @js.native
    def build: js.Function2[
        /* worksheets */ js.Array[Data], 
        /* options */ js.UndefOr[js.Object], 
        js.typedarray.ArrayBuffer
      ] = js.native
    inline def build(worksheets: js.Array[Data]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def build(worksheets: js.Array[Data], options: js.Object): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def build_=(
      x: js.Function2[
          /* worksheets */ js.Array[Data], 
          /* options */ js.UndefOr[js.Object], 
          js.typedarray.ArrayBuffer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build")(x.asInstanceOf[js.Any])
    
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse: js.Function2[
        /* mixed */ String | js.typedarray.ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[Name]
      ] = js.native
    inline def parse(mixed: String): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
    inline def parse(mixed: String, options: js.Object): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
    inline def parse(mixed: js.typedarray.ArrayBuffer): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
    inline def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
    inline def parse_=(
      x: js.Function2[
          /* mixed */ String | js.typedarray.ArrayBuffer, 
          /* options */ js.UndefOr[js.Object], 
          js.Array[Name]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  }
  
  inline def build(worksheets: js.Array[Data]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def build(worksheets: js.Array[Data], options: js.Object): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def parse(mixed: String): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
  inline def parse(mixed: String, options: js.Object): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
  inline def parse(mixed: js.typedarray.ArrayBuffer): js.Array[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Name]]
  inline def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
}
