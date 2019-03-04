package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @api
  */
trait RasterOptions extends js.Object {
  var lib: js.UndefOr[openlayersLib.openlayersMod.GlobalObject] = js.undefined
  var operation: js.UndefOr[openlayersLib.openlayersMod.RasterOperation] = js.undefined
  var operationType: js.UndefOr[openlayersLib.openlayersMod.RasterOperationType] = js.undefined
  var sources: js.Array[openlayersLib.openlayersMod.sourceNs.Source]
  var threads: js.UndefOr[scala.Double] = js.undefined
}

object RasterOptions {
  @scala.inline
  def apply(
    sources: js.Array[openlayersLib.openlayersMod.sourceNs.Source],
    lib: openlayersLib.openlayersMod.GlobalObject = null,
    operation: openlayersLib.openlayersMod.RasterOperation = null,
    operationType: openlayersLib.openlayersMod.RasterOperationType = null,
    threads: scala.Int | scala.Double = null
  ): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources)
    if (lib != null) __obj.updateDynamic("lib")(lib)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
}

