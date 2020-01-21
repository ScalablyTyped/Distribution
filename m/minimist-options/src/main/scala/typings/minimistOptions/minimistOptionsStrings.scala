package typings.minimistOptions

import typings.minimistOptions.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object minimistOptionsStrings {
  @js.native
  sealed trait boolean extends Type
  
  @js.native
  sealed trait string extends Type
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

