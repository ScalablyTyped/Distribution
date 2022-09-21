package typings.physijs.mod

import typings.physijs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createMaterial(material: typings.three.mod.Material): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any]).asInstanceOf[Material]
inline def createMaterial(material: typings.three.mod.Material, friction: Double): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any])).asInstanceOf[Material]
inline def createMaterial(material: typings.three.mod.Material, friction: Double, restitution: Double): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any], restitution.asInstanceOf[js.Any])).asInstanceOf[Material]
inline def createMaterial(material: typings.three.mod.Material, friction: Unit, restitution: Double): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaterial")(material.asInstanceOf[js.Any], friction.asInstanceOf[js.Any], restitution.asInstanceOf[js.Any])).asInstanceOf[Material]

inline def noConflict(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[js.Object]
