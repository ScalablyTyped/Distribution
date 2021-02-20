package typings.nodeXlsx

import typings.nodeXlsx.anon.Data
import typings.nodeXlsx.anon.Name
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("node-xlsx", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-xlsx", "default.build")
    @js.native
    def build: js.Function2[/* worksheets */ js.Array[Name], /* options */ js.UndefOr[js.Object], ArrayBuffer] = js.native
    @JSImport("node-xlsx", "default.build")
    @js.native
    def build(worksheets: js.Array[Name]): ArrayBuffer = js.native
    @JSImport("node-xlsx", "default.build")
    @js.native
    def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = js.native
    @scala.inline
    def build_=(x: js.Function2[/* worksheets */ js.Array[Name], /* options */ js.UndefOr[js.Object], ArrayBuffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build")(x.asInstanceOf[js.Any])
    
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse: js.Function2[
        /* mixed */ String | ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[Data]
      ] = js.native
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse(mixed: String): js.Array[Data] = js.native
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse(mixed: ArrayBuffer): js.Array[Data] = js.native
    @JSImport("node-xlsx", "default.parse")
    @js.native
    def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = js.native
    @scala.inline
    def parse_=(
      x: js.Function2[
          /* mixed */ String | ArrayBuffer, 
          /* options */ js.UndefOr[js.Object], 
          js.Array[Data]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-xlsx", "build")
  @js.native
  def build(worksheets: js.Array[Name]): ArrayBuffer = js.native
  @JSImport("node-xlsx", "build")
  @js.native
  def build(worksheets: js.Array[Name], options: js.Object): ArrayBuffer = js.native
  
  @JSImport("node-xlsx", "parse")
  @js.native
  def parse(mixed: String): js.Array[Data] = js.native
  @JSImport("node-xlsx", "parse")
  @js.native
  def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
  @JSImport("node-xlsx", "parse")
  @js.native
  def parse(mixed: ArrayBuffer): js.Array[Data] = js.native
  @JSImport("node-xlsx", "parse")
  @js.native
  def parse(mixed: ArrayBuffer, options: js.Object): js.Array[Data] = js.native
}
