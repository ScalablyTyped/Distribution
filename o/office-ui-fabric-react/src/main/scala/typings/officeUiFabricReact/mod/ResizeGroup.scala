package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.mod.^
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("office-ui-fabric-react", "ResizeGroup")
@js.native
open class ResizeGroup protected ()
  extends typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase {
  def this(props: IResizeGroupProps) = this()
}
object ResizeGroup {
  
  inline def apply: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("ResizeGroup").asInstanceOf[Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ]]
}
