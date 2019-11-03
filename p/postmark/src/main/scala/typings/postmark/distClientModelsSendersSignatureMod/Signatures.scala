package typings.postmark.distClientModelsSendersSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signatures extends js.Object {
  var SenderSignatures: js.Array[Signature]
  var TotalCount: Double
}

object Signatures {
  @scala.inline
  def apply(SenderSignatures: js.Array[Signature], TotalCount: Double): Signatures = {
    val __obj = js.Dynamic.literal(SenderSignatures = SenderSignatures, TotalCount = TotalCount)
  
    __obj.asInstanceOf[Signatures]
  }
}

