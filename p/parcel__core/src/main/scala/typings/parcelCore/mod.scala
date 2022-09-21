package typings.parcelCore

import typings.parcelCore.anon.PartialFarmOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@parcel/core", JSImport.Default)
  @js.native
  open class default protected () extends Parcel {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InitialParcelOptions */ Any) = this()
  }
  
  @JSImport("@parcel/core", "Parcel")
  @js.native
  open class Parcel protected () extends StObject {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InitialParcelOptions */ Any) = this()
    
    def run(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildSuccessEvent */ Any
      ] = js.native
    
    def watch(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncSubscription */ Any
      ] = js.native
    def watch(
      cb: js.Function2[
          /* err */ js.UndefOr[js.Error | Null], 
          /* buildEvent */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildEvent */ Any
          ], 
          Any
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncSubscription */ Any
      ] = js.native
  }
  
  inline def createWorkerFarm(): typings.parcelWorkers.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkerFarm")().asInstanceOf[typings.parcelWorkers.mod.default]
  inline def createWorkerFarm(options: PartialFarmOptions): typings.parcelWorkers.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkerFarm")(options.asInstanceOf[js.Any]).asInstanceOf[typings.parcelWorkers.mod.default]
}
