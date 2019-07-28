package typings.parquetjs.parquetjsMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetEnvelopeReader")
@js.native
class ParquetEnvelopeReader protected ()
  extends typings.parquetjs.libReaderMod.ParquetEnvelopeReader {
  def this(
    readFn: js.Function3[
        /* fd */ Double, 
        /* position */ Double, 
        /* length */ Double, 
        js.Promise[Buffer | Error]
      ],
    closeFn: js.Function1[/* fd */ Double, js.Promise[Error]],
    fileSize: Double
  ) = this()
}

/* static members */
@JSImport("parquetjs", "ParquetEnvelopeReader")
@js.native
object ParquetEnvelopeReader extends js.Object {
  def openFile(filePath: String): typings.parquetjs.libReaderMod.ParquetReader = js.native
}

