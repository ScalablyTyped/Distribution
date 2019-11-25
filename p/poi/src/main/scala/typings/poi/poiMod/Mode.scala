package typings.poi.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.poi.poiStrings.production
  - typings.poi.poiStrings.development
  - typings.poi.poiStrings.test
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typings.poi.poiStrings.development = this.cast("development")
  @scala.inline
  def production: typings.poi.poiStrings.production = this.cast("production")
  @scala.inline
  def test: typings.poi.poiStrings.test = this.cast("test")
}

