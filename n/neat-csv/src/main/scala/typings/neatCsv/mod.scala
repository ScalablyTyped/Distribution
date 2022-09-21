package typings.neatCsv

import typings.csvParser.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.node.nodeStreamMod.Readable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neat-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RowType](data: String): js.Promise[js.Array[RowType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RowType]]]
  inline def default[RowType](data: String, options: Options): js.Promise[js.Array[RowType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RowType]]]
  inline def default[RowType](data: Buffer): js.Promise[js.Array[RowType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RowType]]]
  inline def default[RowType](data: Buffer, options: Options): js.Promise[js.Array[RowType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RowType]]]
  inline def default[RowType](data: Readable): js.Promise[js.Array[RowType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RowType]]]
  inline def default[RowType](data: Readable, options: Options): js.Promise[js.Array[RowType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RowType]]]
  
  type Row = Record[String, String]
}
