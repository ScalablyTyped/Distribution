package typings.peculiarAsn1Schema

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/objects", JSImport.Namespace)
@js.native
object objectsMod extends js.Object {
  @js.native
  class AsnArray[T] () extends Array[T] {
    def this(items: js.Array[T]) = this()
  }
  
}

