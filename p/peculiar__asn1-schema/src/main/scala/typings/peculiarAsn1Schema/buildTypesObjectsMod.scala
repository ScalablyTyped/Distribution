package typings.peculiarAsn1Schema

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesObjectsMod {
  
  /* note: abstract class */ @JSImport("@peculiar/asn1-schema/build/types/objects", "AsnArray")
  @js.native
  open class AsnArray[T] ()
    extends StObject
       with Array[T] {
    def this(items: js.Array[T]) = this()
  }
}
