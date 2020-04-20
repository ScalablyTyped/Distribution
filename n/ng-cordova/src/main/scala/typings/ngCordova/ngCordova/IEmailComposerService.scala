package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailComposerService extends js.Object {
  def addAlias(app: String, schema: String): Unit
  def isAvailable(): IPromise[Boolean]
  def open(properties: IEmailComposerOptions): IPromise[_]
}

object IEmailComposerService {
  @scala.inline
  def apply(
    addAlias: (String, String) => Unit,
    isAvailable: () => IPromise[Boolean],
    open: IEmailComposerOptions => IPromise[_]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IEmailComposerService]
  }
}

