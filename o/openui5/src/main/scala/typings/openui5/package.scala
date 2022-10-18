package typings.openui5

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A number, potentially with decimals
  */
type float = Double

/**
  * An alternative name for the global type Element.
  *
  * UI5 defines its own type sap.ui.core.Element, which, in the scope of the sap.ui.core
  * namespace, hides the global type. As there are other entities in the same namespace
  * that refer to the global Element in their signatures, this naming conflict can cause
  * type mismatches between sap.ui.core code and other code subclassing from it.
  *
  * To avoid these issues, the alternative name can be used in sap.ui.core signatures.
  *
  * @todo check if HTMLElement could be used instead in UI5 method signatures
  */
type globalElement = Element

type int = Double

type jQuery[T] = JQuery_[T]
