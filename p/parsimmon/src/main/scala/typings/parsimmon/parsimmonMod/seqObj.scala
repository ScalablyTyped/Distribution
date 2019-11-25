package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "seqObj")
@js.native
object seqObj extends js.Object {
  def apply[T, Key /* <: String */](
    args: ((js.Tuple2[
      Key, 
      Parser[
        /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
      ]
    ]) | Parser[_])*
  ): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ typings.parsimmon.parsimmonStrings.seqObj with T
  ] = js.native
}

