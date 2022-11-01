package typings.navermaps.global.naver.maps

import org.scalablytyped.runtime.StringDictionary
import typings.navermaps.naver.maps.MapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapTypeRegistry
  */
@JSGlobal("naver.maps.MapTypeRegistry")
@js.native
open class MapTypeRegistry ()
  extends StObject
     with typings.navermaps.naver.maps.MapTypeRegistry {
  def this(mapTypeInfo: StringDictionary[MapType]) = this()
  def this(mapTypeInfo: StringDictionary[MapType], defaultMapTypeId: String) = this()
  def this(mapTypeInfo: Unit, defaultMapTypeId: String) = this()
}
