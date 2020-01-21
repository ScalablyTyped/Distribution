package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.overwatchApi.overwatchApiStrings.us
  - typings.overwatchApi.overwatchApiStrings.eu
  - typings.overwatchApi.overwatchApiStrings.kr
  - typings.overwatchApi.overwatchApiStrings.cn
  - typings.overwatchApi.overwatchApiStrings.global
*/
trait REGION extends js.Object

object REGION {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cn: typings.overwatchApi.overwatchApiStrings.cn = this.cast("cn")
  @scala.inline
  def eu: typings.overwatchApi.overwatchApiStrings.eu = this.cast("eu")
  @scala.inline
  def global: typings.overwatchApi.overwatchApiStrings.global = this.cast("global")
  @scala.inline
  def kr: typings.overwatchApi.overwatchApiStrings.kr = this.cast("kr")
  @scala.inline
  def us: typings.overwatchApi.overwatchApiStrings.us = this.cast("us")
}

