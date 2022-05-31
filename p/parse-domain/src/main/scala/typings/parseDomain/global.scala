package typings.parseDomain

import typings.parseDomain.mod.ParseOptions
import typings.parseDomain.mod.ParsedDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def parseDomain(url: String): ParsedDomain | Null = js.Dynamic.global.applyDynamic("parseDomain")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedDomain | Null]
  inline def parseDomain(url: String, options: ParseOptions): ParsedDomain | Null = (js.Dynamic.global.applyDynamic("parseDomain")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDomain | Null]
}
