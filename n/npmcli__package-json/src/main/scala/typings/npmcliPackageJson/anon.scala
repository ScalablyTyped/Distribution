package typings.npmcliPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliPackageJson.mod.LiteralUnion
import typings.npmcliPackageJson.npmcliPackageJsonBooleans.`true`
import typings.npmcliPackageJson.npmcliPackageJsonStrings.corporation
import typings.npmcliPackageJson.npmcliPackageJsonStrings.foundation
import typings.npmcliPackageJson.npmcliPackageJsonStrings.github
import typings.npmcliPackageJson.npmcliPackageJsonStrings.individual
import typings.npmcliPackageJson.npmcliPackageJsonStrings.opencollective
import typings.npmcliPackageJson.npmcliPackageJsonStrings.patreon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictmoduleName
    extends StObject
       with /* moduleName */ StringDictionary[js.UndefOr[String]] {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
  }
  object DictmoduleName {
    
    inline def apply(): DictmoduleName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictmoduleName]
    }
    
    extension [Self <: DictmoduleName](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  trait Directory extends StObject {
    
    /**
      * Relative path to package.json if it is placed in non-root directory (for example if it is part of a monorepo).
      *
      * [Read more.](https://github.com/npm/rfcs/blob/latest/implemented/0010-monorepo-subdirectory-declaration.md)
      */
    var directory: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var url: String
  }
  object Directory {
    
    inline def apply(`type`: String, url: String): Directory = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directory]
    }
    
    extension [Self <: Directory](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(name: String): Email = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Install extends StObject {
    
    /**
      * Run **after** the package is installed.
      */
    var install: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** the package is installed and after `install`.
      */
    var postinstall: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** the tarball has been generated and moved to its final destination.
      */
    var postpack: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** the package is published.
      */
    var postpublish: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var postrestart: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm start` command, after `start`.
      */
    var poststart: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm stop` command, after `stop`.
      */
    var poststop: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm test` command, after `test`.
      */
    var posttest: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** the package is uninstalled.
      */
    var postuninstall: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** bump the package version.
      */
    var postversion: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** the package is installed.
      */
    var preinstall: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
      */
    var prepack: js.UndefOr[String] = js.undefined
    
    /**
      * Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
      */
    var prepare: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** the package is published (Also run on local `npm install` without any arguments).
      */
    var prepublish: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** the package is prepared and packed, **only** on `npm publish`.
      */
    var prepublishOnly: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var prerestart: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm start` command, before `start`.
      */
    var prestart: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm stop` command, before `stop`.
      */
    var prestop: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm test` command, before `test`.
      */
    var pretest: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** the package is uninstalled and before `uninstall`.
      */
    var preuninstall: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** bump the package version and before `version`.
      */
    var preversion: js.UndefOr[String] = js.undefined
    
    /**
      * Run **after** the package is published.
      */
    var publish: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      */
    var restart: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm start` command.
      */
    var start: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm stop` command.
      */
    var stop: js.UndefOr[String] = js.undefined
    
    /**
      * Run with the `npm test` command.
      */
    var test: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** the package is uninstalled.
      */
    var uninstall: js.UndefOr[String] = js.undefined
    
    /**
      * Run **before** bump the package version.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Install {
    
    inline def apply(): Install = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Install]
    }
    
    extension [Self <: Install](x: Self) {
      
      inline def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      inline def setPostinstall(value: String): Self = StObject.set(x, "postinstall", value.asInstanceOf[js.Any])
      
      inline def setPostinstallUndefined: Self = StObject.set(x, "postinstall", js.undefined)
      
      inline def setPostpack(value: String): Self = StObject.set(x, "postpack", value.asInstanceOf[js.Any])
      
      inline def setPostpackUndefined: Self = StObject.set(x, "postpack", js.undefined)
      
      inline def setPostpublish(value: String): Self = StObject.set(x, "postpublish", value.asInstanceOf[js.Any])
      
      inline def setPostpublishUndefined: Self = StObject.set(x, "postpublish", js.undefined)
      
      inline def setPostrestart(value: String): Self = StObject.set(x, "postrestart", value.asInstanceOf[js.Any])
      
      inline def setPostrestartUndefined: Self = StObject.set(x, "postrestart", js.undefined)
      
      inline def setPoststart(value: String): Self = StObject.set(x, "poststart", value.asInstanceOf[js.Any])
      
      inline def setPoststartUndefined: Self = StObject.set(x, "poststart", js.undefined)
      
      inline def setPoststop(value: String): Self = StObject.set(x, "poststop", value.asInstanceOf[js.Any])
      
      inline def setPoststopUndefined: Self = StObject.set(x, "poststop", js.undefined)
      
      inline def setPosttest(value: String): Self = StObject.set(x, "posttest", value.asInstanceOf[js.Any])
      
      inline def setPosttestUndefined: Self = StObject.set(x, "posttest", js.undefined)
      
      inline def setPostuninstall(value: String): Self = StObject.set(x, "postuninstall", value.asInstanceOf[js.Any])
      
      inline def setPostuninstallUndefined: Self = StObject.set(x, "postuninstall", js.undefined)
      
      inline def setPostversion(value: String): Self = StObject.set(x, "postversion", value.asInstanceOf[js.Any])
      
      inline def setPostversionUndefined: Self = StObject.set(x, "postversion", js.undefined)
      
      inline def setPreinstall(value: String): Self = StObject.set(x, "preinstall", value.asInstanceOf[js.Any])
      
      inline def setPreinstallUndefined: Self = StObject.set(x, "preinstall", js.undefined)
      
      inline def setPrepack(value: String): Self = StObject.set(x, "prepack", value.asInstanceOf[js.Any])
      
      inline def setPrepackUndefined: Self = StObject.set(x, "prepack", js.undefined)
      
      inline def setPrepare(value: String): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
      
      inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
      
      inline def setPrepublish(value: String): Self = StObject.set(x, "prepublish", value.asInstanceOf[js.Any])
      
      inline def setPrepublishOnly(value: String): Self = StObject.set(x, "prepublishOnly", value.asInstanceOf[js.Any])
      
      inline def setPrepublishOnlyUndefined: Self = StObject.set(x, "prepublishOnly", js.undefined)
      
      inline def setPrepublishUndefined: Self = StObject.set(x, "prepublish", js.undefined)
      
      inline def setPrerestart(value: String): Self = StObject.set(x, "prerestart", value.asInstanceOf[js.Any])
      
      inline def setPrerestartUndefined: Self = StObject.set(x, "prerestart", js.undefined)
      
      inline def setPrestart(value: String): Self = StObject.set(x, "prestart", value.asInstanceOf[js.Any])
      
      inline def setPrestartUndefined: Self = StObject.set(x, "prestart", js.undefined)
      
      inline def setPrestop(value: String): Self = StObject.set(x, "prestop", value.asInstanceOf[js.Any])
      
      inline def setPrestopUndefined: Self = StObject.set(x, "prestop", js.undefined)
      
      inline def setPretest(value: String): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
      
      inline def setPretestUndefined: Self = StObject.set(x, "pretest", js.undefined)
      
      inline def setPreuninstall(value: String): Self = StObject.set(x, "preuninstall", value.asInstanceOf[js.Any])
      
      inline def setPreuninstallUndefined: Self = StObject.set(x, "preuninstall", js.undefined)
      
      inline def setPreversion(value: String): Self = StObject.set(x, "preversion", value.asInstanceOf[js.Any])
      
      inline def setPreversionUndefined: Self = StObject.set(x, "preversion", js.undefined)
      
      inline def setPublish(value: String): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      inline def setRestart(value: String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: String): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setUninstall(value: String): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
      
      inline def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Optional extends StObject {
    
    var optional: `true`
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait TypeUrl extends StObject {
    
    /**
      * The type of funding.
      */
    var `type`: js.UndefOr[
        LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
      ] = js.undefined
    
    /**
      * The URL to the funding page.
      */
    var url: String
  }
  object TypeUrl {
    
    inline def apply(url: String): TypeUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeUrl]
    }
    
    extension [Self <: TypeUrl](x: Self) {
      
      inline def setType(
        value: LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    /**
      * The email address to which issues should be reported.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to the package's issue tracker.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Url {
    
    inline def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
