package typings.npmcliConfig

import typings.npmcliConfig.mod.ConfFileType
import typings.npmcliConfig.mod.ConfType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmcliConfigStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ConfType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `2Dot0Dot0` extends StObject
  inline def `2Dot0Dot0`: `2Dot0Dot0` = "2.0.0".asInstanceOf[`2Dot0Dot0`]
  
  @js.native
  sealed trait Greaterthansign extends StObject
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait Lessthansign extends StObject
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait builtin
    extends StObject
       with ConfType
  inline def builtin: builtin = "builtin".asInstanceOf[builtin]
  
  @js.native
  sealed trait cli
    extends StObject
       with ConfType
  inline def cli: cli = "cli".asInstanceOf[cli]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait env
    extends StObject
       with ConfType
  inline def env: env = "env".asInstanceOf[env]
  
  @js.native
  sealed trait global
    extends StObject
       with ConfFileType
       with ConfType
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait project
    extends StObject
       with ConfFileType
       with ConfType
  inline def project: project = "project".asInstanceOf[project]
  
  @js.native
  sealed trait rename extends StObject
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait user
    extends StObject
       with ConfFileType
       with ConfType
  inline def user: user = "user".asInstanceOf[user]
}
