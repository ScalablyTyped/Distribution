package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the controls which are suitable to shrink.This means the control should still look
  * fine when it gets smaller than its normal size,e.g. Text controls which can show ellipsis in case of
  * shrink.Note: This marker interface can be implemented by controls to give a hint to the
  * container.The control itself does not need to implement anything. A parent control that respects
  * this interfacewill apply the "flex-shrink" as a CSS property which determines how much the item will
  * shrink relativeto the rest of the items in the container when negative free space is distributed.
  * @resource sap/ui/core/library.js
  */
@js.native
trait IShrinkable extends StObject
