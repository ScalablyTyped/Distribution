package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InjectionMode {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "InjectionMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends rules using appendChild.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "InjectionMode.appendChild")
  @js.native
  def appendChild: `2` = js.native
  @scala.inline
  def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
  
  /**
    * Inserts rules using the insertRule api.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "InjectionMode.insertNode")
  @js.native
  def insertNode: `1` = js.native
  @scala.inline
  def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
  
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "InjectionMode.none")
  @js.native
  def none: `0` = js.native
  @scala.inline
  def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
}
