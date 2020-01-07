package typings.ol.sourceRasterMod

import typings.ol.olStrings.image
import typings.ol.olStrings.pixel
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var lib: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[Operation] = js.undefined
  var operationType: js.UndefOr[pixel | image] = js.undefined
  var sources: js.Array[
    typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
  ]
  var threads: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    sources: js.Array[
      typings.ol.sourceSourceMod.default | typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
    ],
    lib: js.Any = null,
    operation: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => js.Array[Double] | ImageData = null,
    operationType: pixel | image = null,
    threads: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction2(operation))
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

