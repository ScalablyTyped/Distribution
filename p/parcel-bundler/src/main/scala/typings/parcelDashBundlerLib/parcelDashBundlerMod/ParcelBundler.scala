package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelBundler extends js.Object {
  def addAssetType(extension: java.lang.String, path: java.lang.String): scala.Unit
  def addPackager(`type`: java.lang.String, packager: java.lang.String): scala.Unit
  def bundle(): js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle]
  def middleware(): js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
    /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
    /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction, 
    _
  ]
}

object ParcelBundler {
  @scala.inline
  def apply(
    addAssetType: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    addPackager: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    bundle: js.Function0[
      js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle]
    ],
    middleware: js.Function0[
      js.Function3[
        /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
        /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
        /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction, 
        _
      ]
    ]
  ): ParcelBundler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAssetType")(addAssetType)
    __obj.updateDynamic("addPackager")(addPackager)
    __obj.updateDynamic("bundle")(bundle)
    __obj.updateDynamic("middleware")(middleware)
    __obj.asInstanceOf[ParcelBundler]
  }
}

