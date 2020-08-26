package typings.ngmap.angular.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgMapProvider extends js.Object {
  /**
    * @param {Hash} options
    * @example
    *  app.config(function(NgMapProvider) {
    *    NgMapProvider.setDefaultOptions({
    *      marker: {
    *        optimized: false
    *      }
    *    });
    *  });
    */
  def setDefaultOptions(options: INgMapOptions): Unit = js.native
}

object INgMapProvider {
  @scala.inline
  def apply(setDefaultOptions: INgMapOptions => Unit): INgMapProvider = {
    val __obj = js.Dynamic.literal(setDefaultOptions = js.Any.fromFunction1(setDefaultOptions))
    __obj.asInstanceOf[INgMapProvider]
  }
  @scala.inline
  implicit class INgMapProviderOps[Self <: INgMapProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetDefaultOptions(value: INgMapOptions => Unit): Self = this.set("setDefaultOptions", js.Any.fromFunction1(value))
  }
  
}

