package typings
package parquetjsLib.parquetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetEnvelopeReader")
@js.native
class ParquetEnvelopeReader protected ()
  extends parquetjsLib.libReaderMod.ParquetEnvelopeReader {
  def this(readFn: js.Function3[
      /* fd */ scala.Double, 
      /* position */ scala.Double, 
      /* length */ scala.Double, 
      js.Promise[nodeLib.Buffer | stdLib.Error]
    ], closeFn: js.Function1[/* fd */ scala.Double, js.Promise[stdLib.Error]], fileSize: scala.Double) = this()
}

/* static members */
@JSImport("parquetjs", "ParquetEnvelopeReader")
@js.native
object ParquetEnvelopeReader extends js.Object {
  def openFile(filePath: java.lang.String): parquetjsLib.libReaderMod.ParquetReader = js.native
}

