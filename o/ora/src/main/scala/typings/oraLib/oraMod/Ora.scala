package typings
package oraLib.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ora extends js.Object {
  var color: oraLib.Color = js.native
  var frameIndex: scala.Double = js.native
  var text: java.lang.String = js.native
  def clear(): Ora = js.native
  def fail(): Ora = js.native
  def fail(text: java.lang.String): Ora = js.native
  def frame(): Ora = js.native
  def info(): Ora = js.native
  def info(text: java.lang.String): Ora = js.native
  def render(): Ora = js.native
  def start(): Ora = js.native
  def start(text: java.lang.String): Ora = js.native
  def stop(): Ora = js.native
  def stopAndPersist(): Ora = js.native
  def stopAndPersist(options: java.lang.String): Ora = js.native
  def stopAndPersist(options: PersistOptions): Ora = js.native
  def succeed(): Ora = js.native
  def succeed(text: java.lang.String): Ora = js.native
  def warn(): Ora = js.native
  def warn(text: java.lang.String): Ora = js.native
}

