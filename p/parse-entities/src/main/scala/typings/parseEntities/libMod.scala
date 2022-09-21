package typings.parseEntities

import typings.parseEntities.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("parse-entities/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseEntities(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEntities")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseEntities(value: String, options: Options[Unit, Unit, Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEntities")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
