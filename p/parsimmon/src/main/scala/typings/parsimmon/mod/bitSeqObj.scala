package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "bitSeqObj")
@js.native
object bitSeqObj extends js.Object {
  /**
  	 * Works like Parsimmon.bitSeq except each item in the array is either a number of
  	 * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
  	 * and put into an object based on the name supplied. If there's no name for the bits,
  	 * it will be parsed but discarded from the returned value.
  	 */
  def apply[Key /* <: String */](namedAlignments: js.Array[(js.Tuple2[Key, Double]) | Double]): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ typings.parsimmon.parsimmonStrings.bitSeqObj with js.Any
  ] = js.native
}

