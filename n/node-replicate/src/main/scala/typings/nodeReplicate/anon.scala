package typings.nodeReplicate

import typings.nodeReplicate.mod.PredictionResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Absoluteurl extends StObject {
    
    var absolute_url: String
    
    var arxiv_paper_id: String
    
    var cover_image: Record[String, String]
    
    var default_example_uuid: String
    
    var description: String
    
    var display_output_as_json: Boolean
    
    var github_url: String
    
    var is_run_only: Boolean
    
    var latest_version_created_at: String | Null
    
    var name: String
    
    var paper_url: String
    
    var username: String
    
    var visibility: String
  }
  object Absoluteurl {
    
    inline def apply(
      absolute_url: String,
      arxiv_paper_id: String,
      cover_image: Record[String, String],
      default_example_uuid: String,
      description: String,
      display_output_as_json: Boolean,
      github_url: String,
      is_run_only: Boolean,
      name: String,
      paper_url: String,
      username: String,
      visibility: String
    ): Absoluteurl = {
      val __obj = js.Dynamic.literal(absolute_url = absolute_url.asInstanceOf[js.Any], arxiv_paper_id = arxiv_paper_id.asInstanceOf[js.Any], cover_image = cover_image.asInstanceOf[js.Any], default_example_uuid = default_example_uuid.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_output_as_json = display_output_as_json.asInstanceOf[js.Any], github_url = github_url.asInstanceOf[js.Any], is_run_only = is_run_only.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paper_url = paper_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], latest_version_created_at = null)
      __obj.asInstanceOf[Absoluteurl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Absoluteurl] (val x: Self) extends AnyVal {
      
      inline def setAbsolute_url(value: String): Self = StObject.set(x, "absolute_url", value.asInstanceOf[js.Any])
      
      inline def setArxiv_paper_id(value: String): Self = StObject.set(x, "arxiv_paper_id", value.asInstanceOf[js.Any])
      
      inline def setCover_image(value: Record[String, String]): Self = StObject.set(x, "cover_image", value.asInstanceOf[js.Any])
      
      inline def setDefault_example_uuid(value: String): Self = StObject.set(x, "default_example_uuid", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplay_output_as_json(value: Boolean): Self = StObject.set(x, "display_output_as_json", value.asInstanceOf[js.Any])
      
      inline def setGithub_url(value: String): Self = StObject.set(x, "github_url", value.asInstanceOf[js.Any])
      
      inline def setIs_run_only(value: Boolean): Self = StObject.set(x, "is_run_only", value.asInstanceOf[js.Any])
      
      inline def setLatest_version_created_at(value: String): Self = StObject.set(x, "latest_version_created_at", value.asInstanceOf[js.Any])
      
      inline def setLatest_version_created_atNull: Self = StObject.set(x, "latest_version_created_at", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPaper_url(value: String): Self = StObject.set(x, "paper_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait Build extends StObject {
    
    var build: Record[String, String]
    
    var predict: String
  }
  object Build {
    
    inline def apply(build: Record[String, String], predict: String): Build = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], predict = predict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Build]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: Record[String, String]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setPredict(value: String): Self = StObject.set(x, "predict", value.asInstanceOf[js.Any])
    }
  }
  
  trait Components extends StObject {
    
    var components: Record[String, String]
    
    var info: Record[String, String]
    
    var openapi: String
    
    var paths: Record[String, String]
  }
  object Components {
    
    inline def apply(
      components: Record[String, String],
      info: Record[String, String],
      openapi: String,
      paths: Record[String, String]
    ): Components = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: Record[String, String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Record[String, String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: Record[String, String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var config: Build
    
    var docker_image_id: String
    
    var docker_image_name: String
    
    var model: Absoluteurl
    
    var openapi_schema: Components
  }
  object Config {
    
    inline def apply(
      config: Build,
      docker_image_id: String,
      docker_image_name: String,
      model: Absoluteurl,
      openapi_schema: Components
    ): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], docker_image_id = docker_image_id.asInstanceOf[js.Any], docker_image_name = docker_image_name.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], openapi_schema = openapi_schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Build): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDocker_image_id(value: String): Self = StObject.set(x, "docker_image_id", value.asInstanceOf[js.Any])
      
      inline def setDocker_image_name(value: String): Self = StObject.set(x, "docker_image_name", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Absoluteurl): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setOpenapi_schema(value: Components): Self = StObject.set(x, "openapi_schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnUpdate extends StObject {
    
    def onUpdate(prediction: PredictionResponse): Unit
  }
  object OnUpdate {
    
    inline def apply(onUpdate: PredictionResponse => Unit): OnUpdate = {
      val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction1(onUpdate))
      __obj.asInstanceOf[OnUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnUpdate] (val x: Self) extends AnyVal {
      
      inline def setOnUpdate(value: PredictionResponse => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    }
  }
  
  trait PollingInterval extends StObject {
    
    var pollingInterval: Double
  }
  object PollingInterval {
    
    inline def apply(pollingInterval: Double): PollingInterval = {
      val __obj = js.Dynamic.literal(pollingInterval = pollingInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollingInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PollingInterval] (val x: Self) extends AnyVal {
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prompt extends StObject {
    
    var prompt: String
  }
  object Prompt {
    
    inline def apply(prompt: String): Prompt = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prompt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
}
