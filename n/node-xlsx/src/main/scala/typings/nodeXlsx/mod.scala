package typings.nodeXlsx

import typings.nodeXlsx.anon.Data
import typings.nodeXlsx.anon.Name
import typings.std.ArrayBuffer
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
    def build: js.Function2[/* worksheets */ js.Array[Name], /* options */ js.UndefOr[js.Object], ArrayBuffer] = js.native
    inline def build(worksheets: js.Array[Name]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    inline def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    inline def build_=(x: js.Function2[/* worksheets */ js.Array[Name], /* options */ js.UndefOr[js.Object], ArrayBuffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build")(x.asInstanceOf[js.Any])
    
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse: js.Function2[
        /* mixed */ String | ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[Data]
      ] = js.native
    inline def parse(mixed: String): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
    inline def parse(mixed: String, options: js.Object): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
    inline def parse(mixed: ArrayBuffer): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
    inline def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
    inline def parse_=(
      x: js.Function2[
          /* mixed */ String | ArrayBuffer, 
          /* options */ js.UndefOr[js.Object], 
          js.Array[Data]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  }
  
  inline def build(worksheets: js.Array[Name]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  inline def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(worksheets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  
  inline def parse(mixed: String): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
  inline def parse(mixed: String, options: js.Object): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
  inline def parse(mixed: ArrayBuffer): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
  inline def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mixed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
}
