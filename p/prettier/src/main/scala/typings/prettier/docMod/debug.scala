package typings.prettier.docMod

import typings.prettier.mod.Doc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debug {
  
  @JSImport("prettier/doc", "debug")
  @js.native
  val ^ : js.Any = js.native
  
  inline def printDocToDebug(doc: Doc_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printDocToDebug")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
}
