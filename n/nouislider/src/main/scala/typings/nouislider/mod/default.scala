package typings.nouislider.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("nouislider", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nouislider", "default.create")
  @js.native
  def create: js.Function2[/* target */ TargetElement, /* originalOptions */ Options, API] = js.native
  inline def create(target: TargetElement, originalOptions: Options): API = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], originalOptions.asInstanceOf[js.Any])).asInstanceOf[API]
  inline def create_=(x: js.Function2[/* target */ TargetElement, /* originalOptions */ Options, API]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  @JSImport("nouislider", "default.cssClasses")
  @js.native
  def cssClasses: CssClasses_ = js.native
  inline def cssClasses_=(x: CssClasses_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("nouislider", "default.__spectrum")
  @js.native
  open class spectrum protected ()
    extends StObject
       with Spectrum {
    def this(entry: Range, snap: Boolean, singleStep: Double) = this()
  }
  
  @JSImport("nouislider", "default.__spectrum")
  @js.native
  def spectrum: Instantiable3[/* entry */ Range, /* snap */ Boolean, /* singleStep */ Double, Spectrum] = js.native
  
  inline def spectrum_=(x: Instantiable3[/* entry */ Range, /* snap */ Boolean, /* singleStep */ Double, Spectrum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__spectrum")(x.asInstanceOf[js.Any])
}
