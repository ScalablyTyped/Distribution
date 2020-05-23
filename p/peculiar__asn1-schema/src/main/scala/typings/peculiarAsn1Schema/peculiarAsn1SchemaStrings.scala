package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.decoratorsMod.AsnRepeatTypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object peculiarAsn1SchemaStrings {
  @js.native
  sealed trait sequence extends AsnRepeatTypeString
  
  @js.native
  sealed trait set extends AsnRepeatTypeString
  
  @scala.inline
  def sequence: sequence = "sequence".asInstanceOf[sequence]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}

